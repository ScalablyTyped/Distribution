organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20190827Z-1b9ed8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20191014Z-f0492d",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-2780ef",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-58b627",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        