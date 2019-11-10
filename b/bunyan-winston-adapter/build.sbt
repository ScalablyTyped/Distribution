organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20181017Z-7f4f00"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-4a145a",
  "org.scalablytyped" %%% "logform" % "2.1.2-dd059e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "winston" % "3.2.1-df199e",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-f31ace")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        