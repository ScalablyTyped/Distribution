organization := "org.scalablytyped"
name := "cpy"
version := "8.1.0-1a0b6a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-38432c",
  "org.scalablytyped" %%% "globby" % "11.0.0-8031f5",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-d1373f",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-f70530",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-3d26b1",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
