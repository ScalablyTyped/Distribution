organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-225576"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-73e7a5",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-a7edc1",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ba127c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        