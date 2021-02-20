organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20201005Z-647441"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-b3fe4c",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-121073",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-c00acc",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-fcabd1",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-3dcb5d",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
