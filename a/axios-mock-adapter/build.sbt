organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-da0d1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-634ead",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-c96e6b",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-6c9251",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        