organization := "org.scalablytyped"
name := "baseui"
version := "9.34.0-a51275"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "card-validator" % "4.1-dt-20180214Z-b81844",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "date-fns" % "2.8.1-1d0941",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "styletron-react" % "5.0-dt-20190925Z-c80e3d",
  "org.scalablytyped" %%% "styletron-standard" % "2.0-dt-20190514Z-9846d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        