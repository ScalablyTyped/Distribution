organization := "org.scalablytyped"
name := "backbone-relational"
version := "0.10.0-dt-20190322Z-b6a05e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190425Z-9dbb22",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-5ae642",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-219e16",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-2336c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        