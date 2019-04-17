organization := "org.scalablytyped"
name := "datatables_dot_net-buttons"
version := "1.4-dt-20190416Z-40dc61"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "datatables_dot_net" % "1.10-dt-20190319Z-d5c0c6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-45cee7",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-dae54d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        