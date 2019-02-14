organization := "org.scalablytyped"
name := "d3-selection-multi"
version := "1.0-dt-20180917Z-d05962"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-6b2eec",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6f430d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        