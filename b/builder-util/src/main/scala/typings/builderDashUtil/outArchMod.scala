package typings.builderDashUtil

import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/arch", JSImport.Namespace)
@js.native
object outArchMod extends js.Object {
  @js.native
  sealed trait Arch extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.builderDashUtil.builderDashUtilStrings.x64
    - typings.builderDashUtil.builderDashUtilStrings.ia32
    - typings.builderDashUtil.builderDashUtilStrings.armv7l
    - typings.builderDashUtil.builderDashUtilStrings.arm64
  */
  trait ArchType extends js.Object
  
  def archFromString(name: String): Arch = js.native
  def getArchCliNames(): js.Array[String] = js.native
  def getArchSuffix(arch: Arch): String = js.native
  def getArtifactArchName(arch: Arch, ext: String): String = js.native
  def toLinuxArchString(arch: Arch, targetName: String): String = js.native
  @js.native
  object Arch extends js.Object {
    @js.native
    sealed trait arm64 extends Arch
    
    @js.native
    sealed trait armv7l extends Arch
    
    @js.native
    sealed trait ia32 extends Arch
    
    @js.native
    sealed trait x64 extends Arch
    
    /* 3 */ val arm64: typings.builderDashUtil.outArchMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typings.builderDashUtil.outArchMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typings.builderDashUtil.outArchMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typings.builderDashUtil.outArchMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Arch with Double] = js.native
  }
  
}

