organization := "org.scalablytyped"
name := "chrome"
version := "0.0-unknown-dt-20191126Z-de1a61"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-55823d",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-b2f6c0",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        