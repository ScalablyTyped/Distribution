organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-403aa2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-6cd3dd",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-68f70d",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-204a2e",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-b55272",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-0bcb2c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        