package typings.braintree.anon

import typings.braintree.braintreeStrings.Discover
import typings.braintree.braintreeStrings.Elo
import typings.braintree.braintreeStrings.JCB
import typings.braintree.braintreeStrings.Laser
import typings.braintree.braintreeStrings.Maestro
import typings.braintree.braintreeStrings.MasterCard
import typings.braintree.braintreeStrings.Solo
import typings.braintree.braintreeStrings.Switch
import typings.braintree.braintreeStrings.Unknown
import typings.braintree.braintreeStrings.Visa
import typings.braintree.braintreeStrings.`American Express`
import typings.braintree.braintreeStrings.`Carte Blanche`
import typings.braintree.braintreeStrings.`China UnionPay`
import typings.braintree.braintreeStrings.`Diners Club`
import typings.braintree.braintreeStrings.`UK Maestro`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  def All(): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  
  var AmEx: `American Express`
  
  var CarteBlanche: `Carte Blanche`
  
  var ChinaUnionPay: `China UnionPay`
  
  var DinersClubInternational: `Diners Club`
  
  var Discover: typings.braintree.braintreeStrings.Discover
  
  var Elo: typings.braintree.braintreeStrings.Elo
  
  var JCB: typings.braintree.braintreeStrings.JCB
  
  var Laser: typings.braintree.braintreeStrings.Laser
  
  var Maestro: typings.braintree.braintreeStrings.Maestro
  
  var MasterCard: typings.braintree.braintreeStrings.MasterCard
  
  var Solo: typings.braintree.braintreeStrings.Solo
  
  var Switch: typings.braintree.braintreeStrings.Switch
  
  var UKMaestro: `UK Maestro`
  
  var Unknown: typings.braintree.braintreeStrings.Unknown
  
  var Visa: typings.braintree.braintreeStrings.Visa
}
object All {
  
  inline def apply(
    All: () => js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
    ]
  ): All = {
    val __obj = js.Dynamic.literal(All = js.Any.fromFunction0(All), AmEx = "American Express", CarteBlanche = "Carte Blanche", ChinaUnionPay = "China UnionPay", DinersClubInternational = "Diners Club", Discover = "Discover", Elo = "Elo", JCB = "JCB", Laser = "Laser", Maestro = "Maestro", MasterCard = "MasterCard", Solo = "Solo", Switch = "Switch", UKMaestro = "UK Maestro", Unknown = "Unknown", Visa = "Visa")
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
    
    inline def setAll(
      value: () => js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
        ]
    ): Self = StObject.set(x, "All", js.Any.fromFunction0(value))
    
    inline def setAmEx(value: `American Express`): Self = StObject.set(x, "AmEx", value.asInstanceOf[js.Any])
    
    inline def setCarteBlanche(value: `Carte Blanche`): Self = StObject.set(x, "CarteBlanche", value.asInstanceOf[js.Any])
    
    inline def setChinaUnionPay(value: `China UnionPay`): Self = StObject.set(x, "ChinaUnionPay", value.asInstanceOf[js.Any])
    
    inline def setDinersClubInternational(value: `Diners Club`): Self = StObject.set(x, "DinersClubInternational", value.asInstanceOf[js.Any])
    
    inline def setDiscover(value: Discover): Self = StObject.set(x, "Discover", value.asInstanceOf[js.Any])
    
    inline def setElo(value: Elo): Self = StObject.set(x, "Elo", value.asInstanceOf[js.Any])
    
    inline def setJCB(value: JCB): Self = StObject.set(x, "JCB", value.asInstanceOf[js.Any])
    
    inline def setLaser(value: Laser): Self = StObject.set(x, "Laser", value.asInstanceOf[js.Any])
    
    inline def setMaestro(value: Maestro): Self = StObject.set(x, "Maestro", value.asInstanceOf[js.Any])
    
    inline def setMasterCard(value: MasterCard): Self = StObject.set(x, "MasterCard", value.asInstanceOf[js.Any])
    
    inline def setSolo(value: Solo): Self = StObject.set(x, "Solo", value.asInstanceOf[js.Any])
    
    inline def setSwitch(value: Switch): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
    
    inline def setUKMaestro(value: `UK Maestro`): Self = StObject.set(x, "UKMaestro", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setVisa(value: Visa): Self = StObject.set(x, "Visa", value.asInstanceOf[js.Any])
  }
}
