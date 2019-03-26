organization := "org.scalablytyped"
name := "chai-http"
version := "4.2.1-697665"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-4c0548",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-9292f7",
  "org.scalablytyped" %%% "is-ip" % "2.0-dt-20180214Z-b1c848",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-a4aaa6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190322Z-09b045",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-580251")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        