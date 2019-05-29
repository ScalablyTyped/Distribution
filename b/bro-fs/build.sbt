organization := "org.scalablytyped"
name := "bro-fs"
version := "0.4-dt-20190326Z-767845"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-fe73d4",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-70322a",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        