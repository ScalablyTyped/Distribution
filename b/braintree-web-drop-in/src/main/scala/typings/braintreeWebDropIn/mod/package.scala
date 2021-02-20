package typings.braintreeWebDropIn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestPaymentMethodCallback = js.Function2[
    /* error */ js.Object | scala.Null, 
    /* payload */ typings.braintreeWebDropIn.mod.PaymentMethodPayload, 
    scala.Unit
  ]
  
  @scala.inline
  def create(options: typings.braintreeWebDropIn.mod.Options): js.Promise[typings.braintreeWebDropIn.mod.Dropin] = typings.braintreeWebDropIn.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.braintreeWebDropIn.mod.Dropin]]
  @scala.inline
  def create(
    options: typings.braintreeWebDropIn.mod.Options,
    callback: js.Function2[
      /* error */ js.Object | scala.Null, 
      /* dropin */ js.UndefOr[typings.braintreeWebDropIn.mod.Dropin], 
      scala.Unit
    ]
  ): scala.Unit = (typings.braintreeWebDropIn.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
