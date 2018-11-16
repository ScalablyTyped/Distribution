package typings
package chaiDashAsDashPromisedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type PromisedCloseTo = js.Function3[
    /* expected */ scala.Double, 
    /* delta */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedEqual = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String], PromisedAssertion]
  type PromisedInstanceOf = js.Function2[
    /* constructor */ js.Object, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedMatch = js.Function2[
    /* regexp */ stdLib.RegExp | java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedMembers = js.Function2[
    /* set */ js.Array[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedNumberComparer = js.Function2[
    /* value */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedOwnProperty = js.Function2[
    /* name */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedProperty = js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedPropertyChange = js.Function3[
    /* object */ js.Object, 
    /* property */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedRespondTo = js.Function2[
    /* method */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
  type PromisedSatisfy = js.Function2[
    /* matcher */ js.Function, 
    /* message */ js.UndefOr[java.lang.String], 
    PromisedAssertion
  ]
}
