organization := "org.scalablytyped"
name := "del"
version := "5.1.0-814528"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-5be3b9",
  "org.scalablytyped" %%% "globby" % "11.0.0-ba16a5",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-27186a",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-e2f00d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-1d7dd8",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
