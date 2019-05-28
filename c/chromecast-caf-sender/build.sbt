organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20190213Z-1a74eb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-63a701",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-a75f93",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-f2122a",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        