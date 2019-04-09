organization := "org.scalablytyped"
name := "chai-http"
version := "4.2.1-13f872"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-0a0732",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-6e62a7",
  "org.scalablytyped" %%% "is-ip" % "2.0-dt-20180214Z-56cf23",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-322462",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190322Z-2e1340",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-56b012")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        