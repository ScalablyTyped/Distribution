organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.33-dt-20220926Z-7ccded"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20220301Z-b9e499",
  "org.scalablytyped" %%% "braintree-web" % "3.75-dt-20220916Z-f7073e",
  "org.scalablytyped" %%% "googlepay" % "0.6-dt-20220624Z-705577",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20221108Z-b0895a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
