organization := "org.scalablytyped"
name := "css-minimizer-webpack-plugin"
version := "1.1-dt-20201105Z-b7f96f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-e2226c",
  "org.scalablytyped" %%% "postcss" % "7.0.35-381672",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
