package typings.braintree.anon

import typings.braintree.braintreeStrings.credit
import typings.braintree.braintreeStrings.sale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sale extends StObject {
  
  def All(): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
  ]
  
  var Credit: credit
  
  var Sale: sale
}
object Sale {
  
  inline def apply(
    All: () => js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
    ]
  ): Sale = {
    val __obj = js.Dynamic.literal(All = js.Any.fromFunction0(All), Credit = "credit", Sale = "sale")
    __obj.asInstanceOf[Sale]
  }
  
  extension [Self <: Sale](x: Self) {
    
    inline def setAll(
      value: () => js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
        ]
    ): Self = StObject.set(x, "All", js.Any.fromFunction0(value))
    
    inline def setCredit(value: credit): Self = StObject.set(x, "Credit", value.asInstanceOf[js.Any])
    
    inline def setSale(value: sale): Self = StObject.set(x, "Sale", value.asInstanceOf[js.Any])
  }
}
