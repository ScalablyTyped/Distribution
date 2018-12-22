organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.15.0-1a5bf1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-51eacb",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-98e2d4",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-767513",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        