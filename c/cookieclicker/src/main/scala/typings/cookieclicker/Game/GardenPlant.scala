package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenPlant extends js.Object {
  
  /**
    * The minimum amount of life ticks to go through on tick
    */
  var ageTick: Double = js.native
  
  /**
    * The amount of additional ticks of life to go through on tick.
    * A part of the number is added to the age, part amount chosen randomly.
    */
  var ageTickR: Double = js.native
  
  /**
    * The names of plants which are displayed to be the plants it mutate to
    */
  var children: js.Array[String] = js.native
  
  /**
    * The chance of contaminating a neighbor plant
    */
  var contam: js.UndefOr[Double] = js.native
  
  /**
    * The cost of the plant, in second of CpS
    */
  var cost: Double = js.native
  
  /**
    * The minimum cost of the plant
    */
  var costM: Double = js.native
  
  /**
    * An additional description for the plant, eg. "Immortal"
    */
  var detailsStr: js.UndefOr[String] = js.native
  
  /**
    * The HTML string of the effects of the plant
    */
  var effsStr: String = js.native
  
  /**
    * True if the plant is a fungus
    */
  var fungus: js.UndefOr[Boolean] = js.native
  
  /**
    * The icon row for the plant in the plant sheet
    */
  var icon: Double = js.native
  
  var id: Double = js.native
  
  /**
    * True if the plant should never go past the mature stage
    */
  var immortal: js.UndefOr[PseudoBoolean | Boolean] = js.native
  
  /**
    * The internal name of the plant
    */
  var key: String = js.native
  
  /**
    * The seed icon element
    */
  var l: HTMLDivElement = js.native
  
  /**
    * The amount of ticks required to pass to mature, with effects
    */
  var mature: Double = js.native
  
  /**
    * The amount of ticks required to pass to mature, without effects
    */
  var matureBase: Double = js.native
  
  /**
    * The displayed name of the plant
    */
  var name: String = js.native
  
  /**
    * If true, the plant can't be contaminated
    */
  var noContam: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when the plant has died due to natural causes
    */
  var onDie: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  
  /**
    * Called when the plant has been harvested
    */
  var onHarvest: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* age */ Double, Unit]] = js.native
  
  /**
    * Called when the plant has been harvested or freezed to death
    */
  var onKill: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* age */ Double, Unit]] = js.native
  
  var plantable: Boolean = js.native
  
  /**
    * The flavour text of the upgrade
    */
  var q: String = js.native
  
  var unlocked: PseudoBoolean | Boolean = js.native
  
  /**
    * True if the plant is a weed
    */
  var weed: Boolean = js.native
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
  implicit class GardenPlantOps[Self <: GardenPlant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgeTick(value: Double): Self = this.set("ageTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeTickR(value: Double): Self = this.set("ageTickR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostM(value: Double): Self = this.set("costM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffsStr(value: String): Self = this.set("effsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMature(value: Double): Self = this.set("mature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatureBase(value: Double): Self = this.set("matureBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlantable(value: Boolean): Self = this.set("plantable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlocked(value: PseudoBoolean | Boolean): Self = this.set("unlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeed(value: Boolean): Self = this.set("weed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContam(value: Double): Self = this.set("contam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContam: Self = this.set("contam", js.undefined)
    
    @scala.inline
    def setDetailsStr(value: String): Self = this.set("detailsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsStr: Self = this.set("detailsStr", js.undefined)
    
    @scala.inline
    def setFungus(value: Boolean): Self = this.set("fungus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFungus: Self = this.set("fungus", js.undefined)
    
    @scala.inline
    def setImmortal(value: PseudoBoolean | Boolean): Self = this.set("immortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmortal: Self = this.set("immortal", js.undefined)
    
    @scala.inline
    def setNoContam(value: Boolean): Self = this.set("noContam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoContam: Self = this.set("noContam", js.undefined)
    
    @scala.inline
    def setOnDie(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onDie", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDie: Self = this.set("onDie", js.undefined)
    
    @scala.inline
    def setOnHarvest(value: (/* x */ Double, /* y */ Double, /* age */ Double) => Unit): Self = this.set("onHarvest", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnHarvest: Self = this.set("onHarvest", js.undefined)
    
    @scala.inline
    def setOnKill(value: (/* x */ Double, /* y */ Double, /* age */ Double) => Unit): Self = this.set("onKill", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnKill: Self = this.set("onKill", js.undefined)
  }
}
