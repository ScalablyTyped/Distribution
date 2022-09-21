package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Use for:
  1. SPServices CAMLQuery attribute
  2. Creating partial expressions
  3. In conjunction with Any & All clauses
  */
/* static member */
inline def Expression(): IFieldExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("Expression")().asInstanceOf[IFieldExpression]

/* static member */
inline def FromXml(xml: String): IRawQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("FromXml")(xml.asInstanceOf[js.Any]).asInstanceOf[IRawQuery]

type IGroupedQuery = ISortable

type ViewField = String | Aggregation
