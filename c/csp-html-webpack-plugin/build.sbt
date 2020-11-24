organization := "org.scalablytyped"
name := "csp-html-webpack-plugin"
version := "3.0-dt-20190926Z-c9a880"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-b44225",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-4370b3",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-9f0ed6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
