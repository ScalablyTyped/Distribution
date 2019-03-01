organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-59bd83"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-b4c9c2",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-c96e6b",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-913fd5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        