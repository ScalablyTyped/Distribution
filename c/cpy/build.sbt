organization := "org.scalablytyped"
name := "cpy"
version := "8.1.0-82b4a6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-3f678d",
  "org.scalablytyped" %%% "globby" % "11.0.0-8f44ae",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-41e9f9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-72b3ae",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-1c2e87",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
