package typings.chaiDashAsDashPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  import typings.std.RegExp

  type PromisedCloseTo = js.Function3[
    /* expected */ Double, 
    /* delta */ Double, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  type PromisedEqual = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedInstanceOf = js.Function2[/* constructor */ js.Object, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedMatch = js.Function2[/* regexp */ RegExp | String, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedMembers = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedNumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedOwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedProperty = js.Function3[
    /* name */ String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  type PromisedPropertyChange = js.Function3[
    /* object */ js.Object, 
    /* property */ String, 
    /* message */ js.UndefOr[String], 
    PromisedAssertion
  ]
  type PromisedRespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], PromisedAssertion]
  type PromisedSatisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], PromisedAssertion]
}
