organization := "org.scalablytyped"
name := "contract-proxy-kit"
version := "1.0-dt-20220624Z-d7f5be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethers" % "5.7.2-3e72dc",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-af6377",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-7a72b4",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-6ecabe",
  "org.scalablytyped" %%% "ethersproject__address" % "5.7.0-562853",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.7.0-6cc4c3",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-29fffe",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-5bf7d7",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.7.0-f41cdf",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.7.0-495a45",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-5d3d5a",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-2aaef8",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-6d75c1",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-c0bd5b",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b44b67",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.7.2-aebaa2",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.7.0-b0c2d9",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-bb98da",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.7.0-4ed896",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-4ee716",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.7.0-accffe",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-251482",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-8293f4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
