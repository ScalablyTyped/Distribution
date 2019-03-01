package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChaiStatic extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable3[
    /* message */ java.lang.String, 
    /* _props */ js.UndefOr[/* _props */ js.Any], 
    /* ssf */ js.UndefOr[/* ssf */ js.Function], 
    AssertionError
  ]
  var assert: AssertStatic
  var config: Config
  var expect: ExpectStatic
  var version: java.lang.String
  def should(): Should
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: js.Function2[/* chai */ js.Any, /* utils */ js.Any, scala.Unit]): ChaiStatic
}

object ChaiStatic {
  @scala.inline
  def apply(
    AssertionError: org.scalablytyped.runtime.Instantiable3[
      /* message */ java.lang.String, 
      /* _props */ js.UndefOr[/* _props */ js.Any], 
      /* ssf */ js.UndefOr[/* ssf */ js.Function], 
      AssertionError
    ],
    assert: AssertStatic,
    config: Config,
    expect: ExpectStatic,
    should: js.Function0[Should],
    use: js.Function1[js.Function2[/* chai */ js.Any, /* utils */ js.Any, scala.Unit], ChaiStatic],
    version: java.lang.String
  ): ChaiStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AssertionError")(AssertionError)
    __obj.updateDynamic("assert")(assert)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("expect")(expect)
    __obj.updateDynamic("should")(should)
    __obj.updateDynamic("use")(use)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ChaiStatic]
  }
}

