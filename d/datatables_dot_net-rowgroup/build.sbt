organization := "org.scalablytyped"
name := "datatables_dot_net-rowgroup"
version := "1.0-dt-20190212Z-ad7fa5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "datatables_dot_net" % "1.10-dt-20190319Z-774e37",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8c3191",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-bc4aa6",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        