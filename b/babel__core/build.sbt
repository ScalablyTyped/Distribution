organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-769b71"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-4337d8",
  "org.scalablytyped" %%% "babel__parser" % "7.3.4-cf56a8",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-4beacf",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-9ced30",
  "org.scalablytyped" %%% "babel__types" % "7.3.4-000790",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        