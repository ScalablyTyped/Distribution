organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-2d4324"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-8746d6",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-52de3f",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-df1bc5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        