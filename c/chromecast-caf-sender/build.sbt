organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20200121Z-bcdf75"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200211Z-171e24",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-07c19a",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-962a9d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
