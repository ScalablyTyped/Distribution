organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20181017Z-1bde1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6b9a99",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-ba716b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "winston" % "3.2.1-d62820",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-cdf7ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        