package typings.c3

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var max: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.Anon2 with TopLevel[js.Any])
  ] = js.undefined
  var min: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.Anon2 with TopLevel[js.Any])
  ] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(
    max: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.Anon2 with TopLevel[js.Any]) = null,
    min: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.Anon2 with TopLevel[js.Any]) = null
  ): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

