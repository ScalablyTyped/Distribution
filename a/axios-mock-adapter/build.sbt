organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-2c17d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-5a0632",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-3db0ff",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-c31d4b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        