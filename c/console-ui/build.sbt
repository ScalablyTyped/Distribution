organization := "org.scalablytyped"
name := "console-ui"
version := "2.2-dt-20181002Z-a60479"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-7d0b54",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-156336",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-cf02c5",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-b2d51c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-b8adfd",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-cc68e7",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-207969",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-f8760a",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a2c51e",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-da16da",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-1fd7ac",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c7354c",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-c613c4",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-2c1602",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-c4eada")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        