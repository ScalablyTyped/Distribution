organization := "com.scalablytyped"
name := "console-ui"
version := "2.2-dt-20181102Z-b3e404"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20181102Z-3345a7",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20181102Z-3fe026",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20181102Z-85961b",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20181102Z-063c8e",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181102Z-6860e9",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20181102Z-e15cd4",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181102Z-1425ea",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20181102Z-cf9944",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20181102Z-f758a5",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20181102Z-342bd4",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20181102Z-65b141",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20181102Z-1e0f71",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20181102Z-b11f3c",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20181102Z-ffc687",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20181102Z-7ae258",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        