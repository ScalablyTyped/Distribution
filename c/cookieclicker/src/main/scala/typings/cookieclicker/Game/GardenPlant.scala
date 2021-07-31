package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GardenPlant extends StObject {
  
  /**
    * The minimum amount of life ticks to go through on tick
    */
  var ageTick: Double
  
  /**
    * The amount of additional ticks of life to go through on tick.
    * A part of the number is added to the age, part amount chosen randomly.
    */
  var ageTickR: Double
  
  /**
    * The names of plants which are displayed to be the plants it mutate to
    */
  var children: js.Array[String]
  
  /**
    * The chance of contaminating a neighbor plant
    */
  var contam: js.UndefOr[Double] = js.undefined
  
  /**
    * The cost of the plant, in second of CpS
    */
  var cost: Double
  
  /**
    * The minimum cost of the plant
    */
  var costM: Double
  
  /**
    * An additional description for the plant, eg. "Immortal"
    */
  var detailsStr: js.UndefOr[String] = js.undefined
  
  /**
    * The HTML string of the effects of the plant
    */
  var effsStr: String
  
  /**
    * True if the plant is a fungus
    */
  var fungus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon row for the plant in the plant sheet
    */
  var icon: Double
  
  var id: Double
  
  /**
    * True if the plant should never go past the mature stage
    */
  var immortal: js.UndefOr[PseudoBoolean | Boolean] = js.undefined
  
  /**
    * The internal name of the plant
    */
  var key: String
  
  /**
    * The seed icon element
    */
  var l: HTMLDivElement
  
  /**
    * The amount of ticks required to pass to mature, with effects
    */
  var mature: Double
  
  /**
    * The amount of ticks required to pass to mature, without effects
    */
  var matureBase: Double
  
  /**
    * The displayed name of the plant
    */
  var name: String
  
  /**
    * If true, the plant can't be contaminated
    */
  var noContam: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the plant has died due to natural causes
    */
  var onDie: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  
  /**
    * Called when the plant has been harvested
    */
  var onHarvest: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* age */ Double, Unit]] = js.undefined
  
  /**
    * Called when the plant has been harvested or freezed to death
    */
  var onKill: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* age */ Double, Unit]] = js.undefined
  
  var plantable: Boolean
  
  /**
    * The flavour text of the upgrade
    */
  var q: String
  
  var unlocked: PseudoBoolean | Boolean
  
  /**
    * True if the plant is a weed
    */
  var weed: Boolean
}
object GardenPlant {
  
  @scala.inline
  def apply(
    ageTick: Double,
    ageTickR: Double,
    children: js.Array[String],
    cost: Double,
    costM: Double,
    effsStr: String,
    icon: Double,
    id: Double,
    key: String,
    l: HTMLDivElement,
    mature: Double,
    matureBase: Double,
    name: String,
    plantable: Boolean,
    q: String,
    unlocked: PseudoBoolean | Boolean,
    weed: Boolean
  ): GardenPlant = {
    val __obj = js.Dynamic.literal(ageTick = ageTick.asInstanceOf[js.Any], ageTickR = ageTickR.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costM = costM.asInstanceOf[js.Any], effsStr = effsStr.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], mature = mature.asInstanceOf[js.Any], matureBase = matureBase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plantable = plantable.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], unlocked = unlocked.asInstanceOf[js.Any], weed = weed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GardenPlant]
  }
  
  @scala.inline
  implicit class GardenPlantMutableBuilder[Self <: GardenPlant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeTick(value: Double): Self = StObject.set(x, "ageTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeTickR(value: Double): Self = StObject.set(x, "ageTickR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setContam(value: Double): Self = StObject.set(x, "contam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContamUndefined: Self = StObject.set(x, "contam", js.undefined)
    
    @scala.inline
    def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostM(value: Double): Self = StObject.set(x, "costM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsStr(value: String): Self = StObject.set(x, "detailsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsStrUndefined: Self = StObject.set(x, "detailsStr", js.undefined)
    
    @scala.inline
    def setEffsStr(value: String): Self = StObject.set(x, "effsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFungus(value: Boolean): Self = StObject.set(x, "fungus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFungusUndefined: Self = StObject.set(x, "fungus", js.undefined)
    
    @scala.inline
    def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmortal(value: PseudoBoolean | Boolean): Self = StObject.set(x, "immortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmortalUndefined: Self = StObject.set(x, "immortal", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMature(value: Double): Self = StObject.set(x, "mature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatureBase(value: Double): Self = StObject.set(x, "matureBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoContam(value: Boolean): Self = StObject.set(x, "noContam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoContamUndefined: Self = StObject.set(x, "noContam", js.undefined)
    
    @scala.inline
    def setOnDie(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onDie", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDieUndefined: Self = StObject.set(x, "onDie", js.undefined)
    
    @scala.inline
    def setOnHarvest(value: (/* x */ Double, /* y */ Double, /* age */ Double) => Unit): Self = StObject.set(x, "onHarvest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnHarvestUndefined: Self = StObject.set(x, "onHarvest", js.undefined)
    
    @scala.inline
    def setOnKill(value: (/* x */ Double, /* y */ Double, /* age */ Double) => Unit): Self = StObject.set(x, "onKill", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKillUndefined: Self = StObject.set(x, "onKill", js.undefined)
    
    @scala.inline
    def setPlantable(value: Boolean): Self = StObject.set(x, "plantable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlocked(value: PseudoBoolean | Boolean): Self = StObject.set(x, "unlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeed(value: Boolean): Self = StObject.set(x, "weed", value.asInstanceOf[js.Any])
  }
}
