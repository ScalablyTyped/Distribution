package typings.builderUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archMod {
  
  @JSImport("builder-util/out/arch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Arch extends StObject
  @JSImport("builder-util/out/arch", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Arch & Double] = js.native
    
    @js.native
    sealed trait arm64
      extends StObject
         with Arch
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 & Double = js.native
    
    @js.native
    sealed trait armv7l
      extends StObject
         with Arch
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l & Double = js.native
    
    @js.native
    sealed trait ia32
      extends StObject
         with Arch
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 & Double = js.native
    
    @js.native
    sealed trait universal
      extends StObject
         with Arch
    /* 4 */ val universal: typings.builderUtil.archMod.Arch.universal & Double = js.native
    
    @js.native
    sealed trait x64
      extends StObject
         with Arch
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 & Double = js.native
  }
  
  inline def archFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("archFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def defaultArchFromString(): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArchFromString")().asInstanceOf[Arch]
  inline def defaultArchFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArchFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def getArchCliNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchCliNames")().asInstanceOf[js.Array[String]]
  
  inline def getArchSuffix(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getArchSuffix(arch: Arch, defaultArch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any], defaultArch.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getArtifactArchName(arch: Arch, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArtifactArchName")(arch.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toLinuxArchString(arch: Arch, targetName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLinuxArchString")(arch.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.builderUtil.builderUtilStrings.x64
    - typings.builderUtil.builderUtilStrings.ia32
    - typings.builderUtil.builderUtilStrings.armv7l
    - typings.builderUtil.builderUtilStrings.arm64
    - typings.builderUtil.builderUtilStrings.universal
  */
  trait ArchType extends StObject
  object ArchType {
    
    inline def arm64: typings.builderUtil.builderUtilStrings.arm64 = "arm64".asInstanceOf[typings.builderUtil.builderUtilStrings.arm64]
    
    inline def armv7l: typings.builderUtil.builderUtilStrings.armv7l = "armv7l".asInstanceOf[typings.builderUtil.builderUtilStrings.armv7l]
    
    inline def ia32: typings.builderUtil.builderUtilStrings.ia32 = "ia32".asInstanceOf[typings.builderUtil.builderUtilStrings.ia32]
    
    inline def universal: typings.builderUtil.builderUtilStrings.universal = "universal".asInstanceOf[typings.builderUtil.builderUtilStrings.universal]
    
    inline def x64: typings.builderUtil.builderUtilStrings.x64 = "x64".asInstanceOf[typings.builderUtil.builderUtilStrings.x64]
  }
}
