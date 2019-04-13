organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-d91b76"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-0e60cb",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-fb5dff",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-037d61",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-0cc4da",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-60afad",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        