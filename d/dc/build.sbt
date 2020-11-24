organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20201002Z-f8ca7c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-fef72f",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-789400",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-631a25",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
