organization := "org.scalablytyped"
name := "datatables_dot_net-select"
version := "1.2-dt-20180328Z-33e3c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "datatables_dot_net" % "1.10-dt-20181220Z-09ab57",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f7f24f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b20ceb",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        