organization := "org.scalablytyped"
name := "datatables_dot_net-rowgroup"
version := "1.0-dt-20200515Z-8dcc05"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "datatables_dot_net" % "1.10-dt-20201002Z-f101ac",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
