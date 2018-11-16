package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PersistenceOptions extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* jqxhr */ jqueryLib.JQueryXHR, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[jqueryLib.JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

