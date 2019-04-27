organization := "org.scalablytyped"
name := "clearbladejs-node"
version := "1.0-dt-20190213Z-3f41d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ae3ed5",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-0d7ee5",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        