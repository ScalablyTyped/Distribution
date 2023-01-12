package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.MIPS
import typings.chromeApps.chromeAppsStrings.MIPS64
import typings.chromeApps.chromeAppsStrings.X86_32
import typings.chromeApps.chromeAppsStrings.X86_64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Naclarch extends StObject {
  
  var nacl_arch: ToStringLiteral[
    ARM, 
    /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
  ]
  
  var sub_package_path: String
}
object Naclarch {
  
  inline def apply(
    nacl_arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
    ],
    sub_package_path: String
  ): Naclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Naclarch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Naclarch] (val x: Self) extends AnyVal {
    
    inline def setNacl_arch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setSub_package_path(value: String): Self = StObject.set(x, "sub_package_path", value.asInstanceOf[js.Any])
  }
}
