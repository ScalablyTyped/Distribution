organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20181017Z-0cf0ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-25de37",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-95f59c",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-63b3a0",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-6dca96",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "winston" % "3.2.1-fd23f5",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-8df7bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        