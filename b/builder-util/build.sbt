organization := "org.scalablytyped"
name := "builder-util"
version := "10.1.2-8164a8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-2f2f56",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fe112c",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-391314",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-ab2f89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        