organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-a0b7a1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-1e7100",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-d8efdf",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-95153d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-aa001d",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-c4cdb3",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        