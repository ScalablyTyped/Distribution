package typings.camljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Use for:
    1. SPServices CAMLQuery attribute
    2. Creating partial expressions
    3. In conjunction with Any & All clauses
    */
  /* static member */
  @scala.inline
  def Expression(): typings.camljs.mod.IFieldExpression = typings.camljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Expression")().asInstanceOf[typings.camljs.mod.IFieldExpression]
  
  /* static member */
  @scala.inline
  def FromXml(xml: java.lang.String): typings.camljs.mod.IRawQuery = typings.camljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("FromXml")(xml.asInstanceOf[js.Any]).asInstanceOf[typings.camljs.mod.IRawQuery]
  
  type IGroupedQuery = typings.camljs.mod.ISortable
  
  type ViewField = java.lang.String | typings.camljs.mod.Aggregation
}
