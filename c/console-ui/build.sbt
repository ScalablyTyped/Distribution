organization := "org.scalablytyped"
name := "console-ui"
version := "2.2-dt-20181002Z-9af584"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-bd64a4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-74b175",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-77094b",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-480d98",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-3a7981",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-01b40d",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-869ef1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-c6dd50",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-b03c0a",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-03954a",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-fb705c",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-04f196",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-340f3a",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-bf3a4e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-392f4f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        